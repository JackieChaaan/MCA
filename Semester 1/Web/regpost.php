<?php
$con=new mysqli('localhost','root','','regformdb');
if($con->connect_error)
{
    die('Access denied');
}
if(isset($_POST['sub'])){
    $n=$_POST['sname'];
    $g=$_POST['gender'];
    $d=$_POST['dob'];
    $a=$_POST['address'];
    $p=$_POST['phone'];
    $gu=$_POST['guardian'];
    $h=$_POST['hobbies'];
    $eca=$_POST['exca'];
    $cu=$_POST['course'];
    
    /*$p=array('Name:'=>$_POST['sname'],'gender:'=>$_POST['gender'],'dob:'=>$_POST['dob'],'address:'=>$_POST['address']);
    foreach ($p as $num=>$det)
    {
        echo ''.$num.''.$det.'<br>';
        
    }*/
    $tbin="insert into reg(name,gender,dob,address,phone,guardian,hobbies,exa,course)values('$n','$g','$d','$a','$p','$gu','$h','$eca','$cu')";
    if($con->query($tbin))
    {
        echo 'inserted successfully';
    }
    else{
        echo 'Error'.$con->error;
    }
    $con->close();
}
?>
