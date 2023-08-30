<html>
<head>
    <title>Add Employee</title>
</head>
<body>
<form  action="save" method="post">
    <fieldset>
        <legend>Add Employee</legend>
        <p>
            <label>ID: </label>
            <input type="number" name="code" required/>
        </p>
        <p>
            <label>Name: </label>
            <input type="text" name="nameE" required/>
        </p>

        <p>
            <label>Age: </label>
            <input type="number" name="age" max="95" min="18" required/>
        </p>
        <p>
            <label>Job: </label>
            <input type="text" name="job" required/>
        </p>
        <p>
            <button>Save</button>
        </p>
    </fieldset>
</form>
</body>
</html>