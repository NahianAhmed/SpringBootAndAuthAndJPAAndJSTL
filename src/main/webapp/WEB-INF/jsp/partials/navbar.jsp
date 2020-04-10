
<div>

<nav class="navbar navbar-expand-lg navbar-light bg-light">

        <a class="navbar-brand" href="/">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">

        <ul class="navbar-nav mr-auto">



        <sec:authorize access="hasRole('USER')">

                <li class="nav-item active">
                        <a class="nav-link" href="/user">User <span class="sr-only"></span></a>
                </li>

                <li class="nav-item active">
                        <a class="nav-link" href="/user/a-user">A User <span class="sr-only"></span></a>
                </li>

                <li class="nav-item">
                        <a class="nav-link" href="/logout"> Logout </a>
                </li>

        </sec:authorize>





        <sec:authorize access="hasRole('ADMIN')">

                <li class="nav-item">
                        <a class="nav-link" href="/admin/add-user"> Add User </a>
                </li>

                <li class="nav-item">
                        <a class="nav-link" href="/admin"> Admin </a>
                </li>

                <li class="nav-item">
                        <a class="nav-link" href="/logout"> Logout </a>
                </li>

        </sec:authorize>



                <li class="nav-item">
                        <a class="nav-link" href="/about"> About </a>
                </li>
                <li class="nav-item">
                        <a class="nav-link" href="/login"> Login </a>
                </li>

                </ul>
                <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
                </div>
                </nav>

</div>