<!doctype html>
<html>
    <head>
        <title>Page Not Found</title>
        <meta name="layout" content="main">
        <g:if env="development"><asset:stylesheet src="errors.css"/></g:if>
    </head>
    <body>
        <ul class="errors">
            <li>Error: Página no encontrada (404)</li>
            <li>Path: ${request.forwardURI}</li>
        </ul>
    </body>
</html>