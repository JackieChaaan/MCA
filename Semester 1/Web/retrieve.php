?php
$rr=new mysqli("localhost","root","","studentsss_2022");
if($rr->connect_error)
{
die("Access denied".$rr->connect_error);
}
$ss="select * from students";
$ff=$rr->query($ss);
echo "<table border='1'><tr><th>ROLL NO</th><th>NAME</th><th>MARK1</th><th>MARK2</th><th>MARK3</th><th>MARK4</th>";
        if($ff->num_rows>0)
        {
        while($d=$ff->fetch_assoc())
        {

        echo "<tr>";
        echo "<td>".$d["ROLL_NO"]."</td><td>".$d["NAME"]."</td><td>".$d["sub1"]."</td><td>".$d["sub2"]."</td><td>".$d["sub3"]."</td><td>".$d["sub4"]."</td>";
        echo "</tr>";
    }
    }
    else 
    {
    echo "Retrieve failed";
    }
    $rr->close();
    ?>