<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--Botstrap-->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
      crossorigin="anonymous"
    />
    <!--Font Awesome-->
    <script
      src="https://kit.fontawesome.com/f5a2001aa5.js"
      crossorigin="anonymous"
    ></script>
    <title>Editar cliente</title>
  </head>
  <body>
    <!--Cabecero-->
    <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp" />

    <form
      action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}"
      method="POST"
      class="was-validated"
    >
      <!--Botones de Navegacion-->
      <jsp:include
        page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"
      />

      <section id="details">
        <div class="container">
          <div class="row">
            <div class="col">
              <div class="card">
                <div class="card-header">
                  <h4>Editar cliente</h4>
                </div>
                <div class="card-body">
                  <div class="form-group mb-3">
                    <label class="form-label" for="nombre">Nombre</label>
                    <input
                      type="text"
                      class="form-control"
                      name="nombre"
                      value="${cliente.nombre}"
                      required
                    />
                  </div>
                  <div class="form-group mb-3">
                    <label class="form-label" for="apellido">Apellido</label>
                    <input
                      type="text"
                      class="form-control"
                      name="apellido"
                      value="${cliente.apellido}"
                      required
                    />
                  </div>
                  <div class="form-group mb-3">
                    <label class="form-label" for="email">Email</label>
                    <input
                      type="email"
                      class="form-control"
                      name="email"
                      value="${cliente.email}"
                      required
                    />
                  </div>
                  <div class="form-group mb-3">
                    <label class="form-label" for="telefono">Telesfono</label>
                    <input
                      type="tel"
                      class="form-control"
                      name="telefono"
                      value="${cliente.telefono}"
                      required
                    />
                  </div>
                  <div class="form-group mb-3">
                    <label class="form-label" for="saldo">Saldo</label>
                    <input
                      type="number"
                      class="form-control"
                      name="saldo"
                      value="${cliente.saldo}"
                      step="any"
                      required
                    />
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </form>

    <!--Pie de pagina-->
    <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp" />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
