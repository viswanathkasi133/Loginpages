<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <body class="bg-light">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="card">
                    <div class="card-header text-center fs-3"> Login Page</div>                
                    <div class="card-body">
                        <form action="loginpage" method="post">
                        
                            <div class="mb-3">
                                <label for="email" class="form-label">Email</label>
                                <span style="color: red;">*</span>
                                <input type="text" class="form-control" name="email">
                            </div>
                            <div class="mb-3">
                                <label for="password" class="form-label">Password</label>
                                <span style="color: red;">*</span>
                                <input type="password" class="form-control" name="password">
                            </div>
								&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <button type="submit" class="btn btn-primary col-md-3">Login</button> &nbsp; &nbsp; &nbsp;&nbsp;
				                <button type="reset" class="btn btn-primary col-md-3">Reset</button> &nbsp; &nbsp; &nbsp;&nbsp;
				                <button type="reset" class="btn btn-primary col-md-3"> <a style="text-decoration: none;" href="register.jsp" > Register </a> </button>

				      </form>

                </div>
            </div>
        </div>
    </div>