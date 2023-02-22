<?php

$bb = new mysqli("localhost", "root", "", "studentsss_2022");

if ($bb->connect_error) {

    die("Access denied" . $bb->connect_error);
}

$tb = "create table students(ROLL_NO int(2)PRIMARY KEY,NAME varchar(20) not null,sub1 int(2),sub2 int(2),sub3 int(2),sub4 int(2)";

if ($bb->query($tb) === TRUE) {

    echo "Table created as students";
} else {

    echo "Error found" . $bb->error;
}

$bb->close();
?>