<%--
  Created by IntelliJ IDEA.
  User: Cedric
  Date: 29/11/17
  Time: 19:07
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
                    <th>Prenom</th>
                    <th>Nom</th>
                    <th>Date de naissance</th>
                    <th>Supprimer</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${membres}" var="membre">
                    <tr>
                        <td class="col-2">${membre.prenom}</td>
                        <td class="col-2">${membre.nom}</td>
                        <td class="col-2">${membre.dateNaiss}</td>
                        <td>
                            <a class="col-2" href="/supprime?membre=${membre.nom}&nom=${membre.nom}&dateNaiss=${membre.dateNaiss}">
                                <i class="fa fa-trash-o"aria-hidden="true"></i>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a class="btn btn-success btn-block" href="/modifier">
                <i class="fa fa-pencil "aria-hidden="true">  Modifier Membre</i>
            </a>
        </div>
    </main>
</div>

<%@include file="../Template/footer.jspf"%>
