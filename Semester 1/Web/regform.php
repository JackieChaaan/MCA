<html>
    <head>
        <title>Registration Form</title>
        <script>
            function formvalidation()
            {
                if (document.rform.sname.value == '')
                {
                    alert("This field required");
                    document.rform.sname.focus();
                    return false;
                }
                if (document.rform.gender.value == '')
                {
                    alert("This field required");
                    document.rform.gender.focus();
                    return false;
                }
                if (document.rform.dob.value == '')
                {
                    alert("This field required");
                    document.rform.dob.focus();
                    return false;
                }
                if (document.rform.address.value == '')
                {
                    alert("This field required");
                    document.rform.address.focus();
                    return false;
                }
                if (document.rform.phone.value == '')
                {
                    alert("This field required");
                    document.rform.phone.focus();
                    return false;
                }
                if (document.rform.guardian.value == '')
                {
                    alert("This field required");
                    document.rform.guardian.focus();
                    return false;
                }
                if (document.rform.hobbies.value == '')
                {
                    alert("This field required");
                    document.rform.hobbies.focus();
                    return false;
                }
                if (document.rform.exca.value == '')
                {
                    alert("This field required");
                    document.rform.exca.focus();
                    return false;
                }
                if (document.rform.course.value == '')
                {
                    alert("This field required");
                    document.rform.course.focus();
                    return false;
                }

            }
        </script>
    </head>
    <body>
    <center>
        <h1>Student Registartion</h1>
        <form method='post' action="regpost.php" onsubmit="return formvalidation()" name='rform'>
            <table border='3'>               
                <tr>
                    <th>Name</th>
                    <td><input type='text' name='sname'></td>
                </tr> 
                <tr>
                    <th>Gender</th>
                    <td>M<input type='radio' name='gender' value="M">F<input type='radio' name='gender' value="F"></td>
                </tr>
                <tr>
                    <th>DOB</th>
                    <td><input type='date' name='dob'></td>
                </tr>
                <tr>
                    <th>Address</th>
                    <td><textarea type='text' name='address'></textarea></td>
                </tr>
                <tr>
                    <th>Phone</th>
                    <td><input type='number' name='phone'></td>
                </tr>
                <tr>
                    <th>Guardian</th>
                    <td><input type='text' name='guardian'></td>
                </tr> 
                <tr>
                    <th>Hobbies</th>
                    <td><textarea type='text' name='hobbies'></textarea></td>
                </tr> 
                <tr>
                    <th>Extra Curricular Activities</th>
                    <td><textarea type='text' name='exca'></textarea></td>
                </tr> 
                <tr>
                    <th>Courses</th>
                    <td><select name='course'>
                            <option>BA</option>
                            <option>BSC</option>
                            <option>BCA</option>
                        </select> </td>
                </tr> 
                <tr >
                    <td colspan='2'><center><input type="submit" value='submit' name='sub'></center></td>
                </tr>
            </table>
        </form>
        <a href='regretrieve.php'>Show</a>
    </center>
</body>
</html>
