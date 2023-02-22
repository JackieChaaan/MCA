<?php

$con=new mysqli('localhost','root','','macollege');

if($con->connect_error)
{
    die('Access denied');
}
$show='select * from department';
$res=$con->query($show);
echo '<table border="1"><tr><th>Department ID</th><th>Department Name</th><th>Department HOD</th><th>Faculty Advisor</th></tr>';
if($res->num_rows>0)
{
    while($r=$res->fetch_assoc())
    {
        echo '<tr><td>'.$r['dept_id'].'</td><td>'.$r['dept_name'].'</td><td>'.$r['dept_hod'].'</td><td>'.$r['dept_facltyadv'].'</td></tr>';
    }
}
 else {
    echo 'retrive failed'.$con->error;
}
$con->close();
echo '<a href="deptform.php">Back</a>';

?>
