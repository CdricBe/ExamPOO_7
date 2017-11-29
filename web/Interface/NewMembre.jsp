<%--
  Created by IntelliJ IDEA.
  User: Cedric
  Date: 20/11/17
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../Template/header.jspf"%>

<%@include file="../Template/navigation.jspf"%>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-4">
            <h3 class="p-3 bg-primary text-black text-center">Nouveau Membre</h3>
            <form action="/creamembre" method="post">
                <div class="form-group">
                    <input class="form-control" type="text" name="nomMembre"
                           placeholder="NOM">
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="prenomMembre"
                           placeholder="PRENOM ">
                </div>
                <div class="form-group">
                    <input class="form-control" type="date" name="DateNaiss"
                           placeholder="DATE DE NAISSANCE JJ/MM/AAAA">
                </div>

                <div class="form-group">

                    <input class="form-control" type="text" name="club" placeholder="Numero du club">

                <select name="NomClub" id="NClub">

                    <c:forEach items="${clubs}" var="club">

                        <option value='<c:out value="${club.id}${club.nom}"/>'><c:out value="${club.id}    ${club.nom}"/></option>

                    </c:forEach>

                </select>

                </div>



                <input class="btn btn-default btn-block bg-primary text-black" type="submit" value="valider">
            </form>

        </div>
    </div>

</div>

<%@include file="../Template/footer.jspf"%>

