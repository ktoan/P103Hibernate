<nav class="navbar navbar-dark bg-dark px-3">
    <div class="d-flex align-items-center">
        <a href="${pageContext.request.contextPath}/"
           class="text-white text-decoration-none navbar-brand mb-0 h1">HR</a>
        <div class="d-flex gap-3 align-items-center">
            <a href="${pageContext.request.contextPath}/"
               class="text-white text-decoration-none">View Visitors</a>
            <a href="${pageContext.request.contextPath}/create-visitor"
               class="text-white text-decoration-none">Create</a>
        </div>
    </div>
    <a href="${pageContext.request.contextPath}/log-out"
       style="display: ${sessionScope.username != null ? "block" : "none"}"
       class="text-decoration-none text-danger">
        <p class="mb-0">
            Logout
        </p>
    </a>
</nav>