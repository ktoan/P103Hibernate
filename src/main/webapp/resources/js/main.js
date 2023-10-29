$(document).ready(function () {
    const urlParams = new URLSearchParams(window.location.search);
    const paramValue = urlParams.get("key");
    $("input[name='key']").val(paramValue);

    $("form[name='createForm']").submit(function (e) {
        e.preventDefault();
        let formData = $(this).serializeArray();

        function getInputValueByName(name) {
            for (let i = 0; i < formData.length; i++) {
                if (formData[i].name === name) {
                    return formData[i].value;
                }
            }
        }

        function getHobbies() {
            let hobbies = [];
            for (let i = 0; i < formData.length; i++) {
                if (formData[i].name === "hobbies") {
                    hobbies.push(formData[i].value);
                }
            }
            return hobbies;
        }

        let hobbiesList = getHobbies();
        let hobbiesData = "";

        for (let i = 0; i < hobbiesList.length; i++) {
            if (i === 0) {
                hobbiesData += hobbiesList[i];
            } else {
                hobbiesData += ", ";
                hobbiesData += hobbiesList[i];
            }
        }

        let requestBody = {
            firstName: getInputValueByName("firstName"),
            lastName: getInputValueByName("lastName"),
            gender: getInputValueByName("gender"),
            phone: getInputValueByName("phone"),
            email: getInputValueByName("email"),
            description: getInputValueByName("description"),
            area:
                getInputValueByName("area") === undefined
                    ? ""
                    : getInputValueByName("area"),
            hobbies: hobbiesData,
        };

        $.ajax({
            type: "POST",
            url: "/create-visitor",
            data: requestBody,
            success: function (response) {
                if ("SUCCESS" === response) {
                    alert("Create successfully!");
                    location.reload();
                } else {
                    alert(response);
                }
            },
        });
    });
});
