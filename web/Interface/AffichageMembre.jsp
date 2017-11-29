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
                        <td class="col-3">${membre.nomMembre}</td>
                        <td class="col-3">${membre.prenomMembre}</td>
                        <td class="col-3">${membre.dateMembre}</td>
                        <td class="col-3">${membre.clubMembre}</td>
                        <td>
                            <a class="col-3" href="/supprime?membre=${membre.nomMembre}&nom=${membre.prenomMembre}&dateNaiss=${membre.dateMembre}">
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
