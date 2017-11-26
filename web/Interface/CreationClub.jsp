<%--
  Created by IntelliJ IDEA.
  User: etudiants
  Date: 18-11-17
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>

<%@include file="../Template/header.jspf"%>

<%@include file="../Template/navigation.jspf"%>


<div class="container">
    <div class="row justify-content-center">
        <div class="col-4">
            <h3 class="p-3 bg-primary text-black text-center">Création d'un club</h3>
            <form action="/creaclub" method="post">
                <div class="form-group">
                    <input class="form-control" type="text" name="nomClub"
                           placeholder="nom du club">
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="typeClub"
                           placeholder="type de club">
                </div>
                <input class="btn btn-default btn-block bg-primary text-black" type="submit" value="valider">
            </form>
        </div>
    </div>

</div>

<%@include file="../Template/footer.jspf"%>




