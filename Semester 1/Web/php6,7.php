<html>

    <head>

        <style>

            table{

                border-collapse:collapse;

                border-color:black;

            }

        </style>

    </head>



    <body>

        <form  action="" method="post">



            <table border="3" align="center">

                <tr><th colspan="2" align="center">INTERNAL MARKS</th></tr>

                <tr><th>ROLL NO:</th><td><input name="rr"></td></tr>

                <tr><th>NAME   :</th><td><input name="nn"></td></tr>

                <tr><th>PHYSICS  :</th><td><input name="m1"></td></tr>

                <tr><th>CHEMISTRY  :</th><td><input name="m2"></td></tr>

                <tr><th>MATHEMATICS :</th><td><input name="m3"></td></tr>

                <tr><td colspan="2" align="center"><input type="submit" value="SUBMIT"></td></tr>



            </table>

        </form>

    </center>





</body>

</html>

<?php
if ($_POST) {



    $ro = $_POST['rr'];

    $na = $_POST['nn'];

    $ph = $_POST['m1'];

    $ch = $_POST['m2'];

    $ma = $_POST['m3'];

    $tot = $ph + $ch + $ma;

    echo "<table align=center border=1>";

    echo "<tr><td><b>ROLL NO</b></td><td><b>STUDENT NAME</b></td><td><b>PHYSICS</b></td><td><b>CHEMISTRY</b></td><td><b>MATHEMATICS</b></td></tr>";

    echo "<tr><td><b>" . $ro . "</b></td><td><b>" . $na . "</b></td><td><b>" . $ph . "</b></td><td><b>" . $ch . "</b></td><td><b>" . $ma . "</b></td></tr>";

    echo "<tr><th colspan=4></th></tr>";

    echo "<tr><th colspan=4>Total MARK</th><td>" . $tot . "</td></tr>";

    echo "</table>";
}
?>

