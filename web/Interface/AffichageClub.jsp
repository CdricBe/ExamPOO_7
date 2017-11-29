<%--
  Created by IntelliJ IDEA.
  User: Jacques
  Date: 26/11/2017
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>

<%@include file="../Template/header.jspf"%>

<%@include file="../Template/navigation.jspf"%>


<div class="container">
    <main class="row justify-content-center">
        <div class="col-6">

            <table class="table table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Nom du club</th>
                    <th>Type</th>
                    <th>Supprimer</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${clubs}" var="club">
                    <tr>
                        <td class="col-1">${club.id}</td>
                        <td class="col-2">${club.nom}</td>
                        <td class="col-2">${club.type}</td>
                        <td>
                            <a class="col-2" href="/supprime?club=${club.nom}&type=${club.type}">
                                <i class="fa fa-trash-o"aria-hidden="true"></i>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a class="btn btn-success btn-block" href="/modifier">
                <i class="fa fa-pencil "aria-hidden="true">  Modifier club</i>
            </a>
        </div>
    </main>
</div>








<%@include file="../Template/footer.jspf"%>