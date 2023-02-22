

<?php
if(isset($_POST['su']))
{
    $r=$_POST['srollnum'];
    $n=$_POST['sname'];
    $s=$_POST['s_sem'];
    $s1=$_POST['s1'];
    $s2=$_POST['s2'];
    $s3=$_POST['s3'];
    
    $t=$s1+$s2+$s3;
    echo $n;
    echo '<br>';
    echo '$s';
    
    echo 'Total mark is=',$t;
}
    $cc=new mysqli("localhost","root","","studentdb");
    if($cc->connect_error)
    {
        die("Connection erroe".$cc->connect_error);
    }
     $tb="insert into stable(Rollnum,Name,Semester,sub1,sub2,sub3,Total)values('$r','$n','$s','$s1','$s2','$s3','$t')";
     if($cc->query($tb))
     {
         echo 'Successfully inserted';
     }
     else{
         echo 'Error'.$cc->error;
     }
     $d='select * from stable';
     $result=$cc->query($d);
     echo "<table border='1'><tr><th>Roll Number</th><th>Name</th><th>Semester</th><th>Sub1</th><th>sub2</th><th>Sub3</th><th>Total</th></tr>";
     if($result->num_rows>0)
     {
         while($f=$result->fetch_assoc())
         {
             echo "<tr><td>".$f['Rollnum']."</td><td>".$f['Name']."</td><td>".$f['Semester']."</td><td>".$f['sub1']."</td><td>".$f['sub2']."</td><td>".$f['sub3']."</td><td>".$f['Total']."</td></tr>";    
         }
     }
     else{
         echo 'Retrieve failed';
     }
     $cc->close();
?>