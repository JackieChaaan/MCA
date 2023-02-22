<html>
    <head>
        <title>MA COLLEGE OF ENGINEERING</title>
    </head>
    <script type='text/javascript'>
        function fvalidation()
        {
            if(document.deptform.dpt_id.value=="")
            {
                alert('id required');
                document.deptform.dpt_id.focus();
                return false;
            }
            if(document.deptform.dpt_name.value=="")
            {
                alert('name required');
                document.deptform.dpt_name.focus();
                return false;
            }
            if(document.deptform.dpt_hod.value=="")
            {
                alert('hod name required');
                document.deptform.dpt_hod.focus();
                return false;
            }
            if(document.deptform.dpt_fltyadv.value=="")
            {
                alert('Faculty advisor name required');
                document.deptform.dpt_fltyadv.focus();
                return false;
            }
        }
    </script>
    <body>
    <center>
        <h1>MA COLLEGE OF ENGINEERING</h1>
        <h2>Fill The Form</h2>
        <form method="post" action="deptform.php" name="deptform" onsubmit="return fvalidation()">
            <table border="1">
                <tr>
                    <th>Department ID</th>
                    <td><input type="number" name="dpt_id"></td>
                </tr>
                <tr>
                    <th>Department Name</th>
                    <td><input type="text" name="dpt_name"></td>
                </tr>
                <tr>
                    <th>Department HOD</th>
                    <td><input type="text" name="dpt_hod"></td>
                </tr>
                <tr>
                    <th>Faculty Advisor</th>
                    <td><input type="text" name="dpt_fltyadv"></td>
                </tr>
            </table>
            <input type="submit" name="sub" value="submit">
            <a href="dptshow.php">show table</a>
        </form>
    </center>
</body>
</html>

<?php
$con=new mysqli("localhost","root","","macollege");
if($con->connect_error)
{
    die("Access Denied");
}
if(isset($_POST["sub"]))
{
    $dptid=$_POST['dpt_id'];
    $dptname=$_POST['dpt_name'];
    $dpthod=$_POST['dpt_hod'];
    $dptfadv=$_POST['dpt_fltyadv'];
   
$vain="insert into department(dept_id,dept_name,dept_hod,dept_facltyadv)values('$dptid','$dptname','$dpthod','$dptfadv')";
if($con->query($vain))
{
    echo '<script>alert("Value inserted successfully")</script>';
}
else
{
    echo '<script>alert(Error)</script>'.$con->error;
}
}
$con->close();