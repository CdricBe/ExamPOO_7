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

            <br>
            <br>

            <form action="/AfficheMembreClub" method="get">
                <table>
                    <td><p class="form-control">Affiche membres par club</p></td>
               <td><div class="form-group">
                    <select name="club" id="NClub">

                        <c:forEach items="${clubs}" var="club">

                            <option value='<c:out value="${club.id}"/>'><c:out value="${club.nom}"/></option>

                        </c:forEach>

                    </select>

                </div>
               </td>
                </table>
                <input class="btn btn-default btn-block bg-primary text-black" type="submit" value="valider">
            </form>

            <a href="/AfficheMembreClub">z</a>

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
                <%--
                    Affichage des membres sous tableau
                 --%>
                <c:forEach items="${membres}" var="membre">
                    <tr>
                        <td class="col-3">${membre.nomMembre}</td>
                        <td class="col-3">${membre.prenomMembre}</td>
                        <td class="col-3">${membre.dateMembre}</td>
                        <td class="col-3">${membre.clubMembre}</td>
                        <td>
                                <%--
                                supprime membre
                            --%>
                            <a class="col-3" href="/deleteMembre?delNomMembre=${membre.nomMembre}&delPrenomMembre=${membre.prenomMembre}">
                                <i class="fa fa-trash-o"aria-hidden="true"></i>
                            </a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <%--
             modif membre
            --%>
            <a class="btn btn-success btn-block" href="/modifMembre">
                <i class="fa fa-pencil "aria-hidden="true">  Modifier Membre</i>
            </a>



        </div>
    </main>
</div>




<%@include file="../Template/footer.jspf"%>
