<%--
  Created by IntelliJ IDEA.
  User: Cedric
  Date: 20/11/17
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gestion des Membres</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <script src="https://use.fontawesome.com/992bb673ff.js"></script>
</head>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-4">
            <h3 class="p-3 bg-primary text-black text-center">Nouveau Membre</h3>
            <form action="/membre" method="post">
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
                <input class="btn btn-default btn-block bg-primary text-black" type="submit" value="valider">
            </form>
        </div>
    </div>

</div>





<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>


</body>
</html>
