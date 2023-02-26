<?php

$con = new mysqli('localhost', 'root', '', 'regformdb');

if ($con->connect_error) {
    die('Access Denied');
}
$dis = 'select id,name,course from reg';
$res = $con->query($dis);
echo '<table border=2><tr><th>ID</th><th>Name</th><th>Course</th></tr>';
if ($res->num_rows > 0) {
    while ($r = $res->fetch_assoc()) {
        echo '<tr><td>' . $r['id'] . '</td><td>' . $r['name'] . '</td><td>' . $r['course'] . '</td></tr>';
    }
} else {
    echo 'Faild' . $con->error;
}
$con->close();
?>

