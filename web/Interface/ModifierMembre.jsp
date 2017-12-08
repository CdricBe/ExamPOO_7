<%@include file="../Template/header.jspf"%>

<%@include file="../Template/navigation.jspf"%>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-4">
            <h3 class="p-3 bg-primary text-black text-center">Modification d'un membre</h3>
            <form action="/modifMembre" method="post">
                <div class="form-group">
                    <select name="membreamodif" id="ModifMembre">
                        <c:forEach items="${membres}" var="membre">
                            <option value='<c:out value="${membre.nomMembre}"/>'><c:out value="${membre.nomMembre}   ${membre.prenomMembre}"/></option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="NewNMembre"
                           placeholder="nouveau nom">
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="NewPMembre"
                           placeholder="nouveau prenom">
                </div>

                <table>

                <td><p class="form-control">nouveau club pour le membre</p></td>

                    <td><div class="form-group">

                     <select name="NewClub" id="NClub">

                        <c:forEach items="${clubs}" var="club">

                            <option value='<c:out value="${club.id}"/>'><c:out value="${club.nom}"/></option>

                        </c:forEach>

                    </select>

                </div></td>
                </table>


                <input class="btn btn-default btn-block bg-primary text-black" type="submit" value="valider">
                <p class="bg-danger text-white">${errorMessage}</p>
            </form>
        </div>
    </div>

</div>







<%@include file="../Template/footer.jspf"%>