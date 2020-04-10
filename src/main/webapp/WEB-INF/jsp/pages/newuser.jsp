

  <h1>${data}</h1>
  <h1>${flash}</h1>
  <h1>${namex}</h1>

<form method="POST" action="/admin/save-user">

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

    <div class="form-group">
        <label for="user_name">User Name</label>
        <input type="text" name="userName" class="form-control" id="user_name"  placeholder="Enter User Name">

    </div>
    <div class="form-group">
        <label for="active"> Active </label>
        <select class="form-control form-control" name="active" id="active">
            <option value="1" >YES</option>
            <option value="0" >NO</option>
        </select>
    </div>

    <div class="form-group">
        <label for="roles">User Role</label>
        <select class="form-control form-control" name="roles" id="roles">
            <option value="ROLE_ADMIN" >Admin</option>
            <option value="ROLE_USER" >User</option>
        </select>
    </div>

    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>