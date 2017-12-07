<%@include file="../Template/header.jspf"%>

<%@include file="../Template/navigation.jspf"%>



<div class="container">
    <main class="row justify-content-center">
        <div class="col-6">

            <br>
            <br>

            <form action="/AfficheMembreClub" method="post">
                <div class="form-group">
                    <div class="form-group">
                        <input class="form-control" type="text" name="nomClub"
                               placeholder="nom du club pour afficher les membres">
                    </div>
                </div>
                <input class="btn btn-default btn-block bg-primary text-black" type="submit" value="valider">
            </form>

            <br>
            <br>

            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Date de naissance</th>
                    <th>Club</th>
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
                            <a class="col-3" href="/deleteMembre?delNomMembre=${membre.nomMembre}&delPrenomMembre=${membre.prenomMembre}">
                                <i class="fa fa-trash-o"aria-hidden="true"></i>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a class="btn btn-success btn-block" href="/modifMembre">
                <i class="fa fa-pencil "aria-hidden="true">  Modifier Membre</i>
            </a>

            <br>
            <br>
            <br>
            <br>

            <form action="/AfficheMembre" method="post">
                <div class="form-group">
                    <select name="nomclub" id="NClub">
                        <c:forEach items="${clubs}" var="club">
                            <option value='<c:out value="${club.id}"/>'><c:out value="${club.nom}"/></option>
                        </c:forEach>
                    </select>
                </div>
                <input class="btn btn-default btn-block bg-primary text-black" type="submit" value="valider">
            </form>
        </div>
    </main>
</div>




