<%@include file="../Template/header.jspf"%>

<%@include file="../Template/navigation.jspf"%>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-4">
            <h3 class="p-3 bg-primary text-black text-center">Suppresion d'un club</h3>
            <form action="/modifier" method="post">
                <div class="form-group">
                    <input class="form-control" type="text" name="ClubModifier"
                           placeholder="nom du club à modifier">
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="NewClub"
                           placeholder="nouveau nom">
                </div>
                <div class="form-group">
                    <input class="form-control" type="text" name="NewType"
                           placeholder="nouveau type">
                </div>
                <input class="btn btn-default btn-block bg-primary text-black" type="submit" value="valider">
            </form>
        </div>
    </div>

</div>







<%@include file="../Template/footer.jspf"%>


