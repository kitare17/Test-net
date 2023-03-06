package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testmonial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/include/header.jsp");
    _jspx_dependants.add("/include/testmonial-form.jsp");
    _jspx_dependants.add("/include/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>PET SHOP</title>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("    <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <!-- Google Web Fonts -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins&family=Roboto:wght@700&display=swap\" rel=\"stylesheet\">  \n");
      out.write("\n");
      out.write("    <!-- Icon Font Stylesheet -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"lib/flaticon/font/flaticon.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Libraries Stylesheet -->\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Template Stylesheet -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!-- Topbar Start -->\n");
      out.write("    <div class=\"container-fluid border-bottom d-none d-lg-block\">\n");
      out.write("        <div class=\"row gx-0\">\n");
      out.write("            <div class=\"col-lg-4 text-center py-2\">\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                    <i class=\"bi bi-geo-alt fs-1 text-primary me-3\"></i>\n");
      out.write("                    <div class=\"text-start\">\n");
      out.write("                        <h6 class=\"text-uppercase mb-1\">Our Office</h6>\n");
      out.write("                        <span>123 Street, Da Nang, Viet Nam</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 text-center border-start border-end py-2\">\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                    <i class=\"bi bi-envelope-open fs-1 text-primary me-3\"></i>\n");
      out.write("                    <div class=\"text-start\">\n");
      out.write("                        <h6 class=\"text-uppercase mb-1\">Email Us</h6>\n");
      out.write("                        <span>info@fpt.edu.vn</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 text-center py-2\">\n");
      out.write("                <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                    <i class=\"bi bi-phone-vibrate fs-1 text-primary me-3\"></i>\n");
      out.write("                    <div class=\"text-start\">\n");
      out.write("                        <h6 class=\"text-uppercase mb-1\">Call Us</h6>\n");
      out.write("                        <span>+012 345 6789</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Topbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Navbar Start -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-white navbar-light shadow-sm py-3 py-lg-0 px-3 px-lg-0\">\n");
      out.write("        <a href=\"index.jsp\" class=\"navbar-brand ms-lg-5\">\n");
      out.write("            <h1 class=\"m-0 text-uppercase text-dark\"><i class=\"bi bi-shop fs-1 text-primary me-3\"></i>Pet Shop</h1>\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("            <div class=\"navbar-nav ms-auto py-0\">\n");
      out.write("                <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                <a href=\"about.jsp\" class=\"nav-item nav-link\">About</a>\n");
      out.write("                <a href=\"service.jsp\" class=\"nav-item nav-link\">Service</a>\n");
      out.write("                <a href=\"product.jsp\" class=\"nav-item nav-link\">Product</a>\n");
      out.write("                <div class=\"nav-item dropdown\">\n");
      out.write("                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\n");
      out.write("                    <div class=\"dropdown-menu m-0\">\n");
      out.write("                        <a href=\"testmonial.jsp\" class=\"dropdown-item\">Testimonial</a>\n");
      out.write("                        <a href=\"blog.jsp\" class=\"dropdown-item\">Blog Grid</a>\n");
      out.write("                        <a href=\"detail.jsp\" class=\"dropdown-item\">Blog Detail</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"contact.jsp\" class=\"nav-item nav-link nav-contact bg-primary text-white px-5 ms-lg-5\">Log in <i class=\"bi bi-arrow-right\"></i></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Testimonial Start -->\n");
      out.write("    <div class=\"container-fluid bg-testimonial py-5\" style=\"margin: 90px 0;\">\n");
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <div class=\"row justify-content-end\">\n");
      out.write("                <div class=\"col-lg-7\">\n");
      out.write("                    <div class=\"owl-carousel testimonial-carousel bg-white p-5\">\n");
      out.write("                        <div class=\"testimonial-item text-center\">\n");
      out.write("                            <div class=\"position-relative mb-4\">\n");
      out.write("                                <img class=\"img-fluid mx-auto\" src=\"img/testimonial-1.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"position-absolute top-100 start-50 translate-middle d-flex align-items-center justify-content-center bg-white\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                                    <i class=\"bi bi-chat-square-quote text-primary\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Dolores sed duo clita tempor justo dolor et stet lorem kasd labore dolore lorem ipsum. At lorem lorem magna ut et, nonumy et labore et tempor diam tempor erat. Erat dolor rebum sit ipsum.</p>\n");
      out.write("                            <hr class=\"w-25 mx-auto\">\n");
      out.write("                            <h5 class=\"text-uppercase\">Client Name</h5>\n");
      out.write("                            <span>Profession</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"testimonial-item text-center\">\n");
      out.write("                            <div class=\"position-relative mb-4\">\n");
      out.write("                                <img class=\"img-fluid mx-auto\" src=\"img/testimonial-2.jpg\" alt=\"\">\n");
      out.write("                                <div class=\"position-absolute top-100 start-50 translate-middle d-flex align-items-center justify-content-center bg-white\" style=\"width: 45px; height: 45px;\">\n");
      out.write("                                    <i class=\"bi bi-chat-square-quote text-primary\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Dolores sed duo clita tempor justo dolor et stet lorem kasd labore dolore lorem ipsum. At lorem lorem magna ut et, nonumy et labore et tempor diam tempor erat. Erat dolor rebum sit ipsum.</p>\n");
      out.write("                            <hr class=\"w-25 mx-auto\">\n");
      out.write("                            <h5 class=\"text-uppercase\">Client Name</h5>\n");
      out.write("                            <span>Profession</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Testimonial End -->");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer Start -->\n");
      out.write("<div class=\"container-fluid bg-light mt-5 py-5\">\n");
      out.write("    <div class=\"container pt-5\">\n");
      out.write("        <div class=\"row g-5\">\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Get In Touch</h5>\n");
      out.write("                <p class=\"mb-4\">No dolore ipsum accusam no lorem. Invidunt sed clita kasd clita et et dolor sed dolor</p>\n");
      out.write("                <p class=\"mb-2\"><i class=\"bi bi-geo-alt text-primary me-2\"></i>123 Street, New York, USA</p>\n");
      out.write("                <p class=\"mb-2\"><i class=\"bi bi-envelope-open text-primary me-2\"></i>info@example.com</p>\n");
      out.write("                <p class=\"mb-0\"><i class=\"bi bi-telephone text-primary me-2\"></i>+012 345 67890</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Quick Links</h5>\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Home</a>\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>About Us</a>\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Our Services</a>\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Latest Blog</a>\n");
      out.write("                    <a class=\"text-body\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Contact Us</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Popular Links</h5>\n");
      out.write("                <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Home</a>\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>About Us</a>\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Our Services</a>\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Meet The Team</a>\n");
      out.write("                    <a class=\"text-body mb-2\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Latest Blog</a>\n");
      out.write("                    <a class=\"text-body\" href=\"#\"><i class=\"bi bi-arrow-right text-primary me-2\"></i>Contact Us</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                <h5 class=\"text-uppercase border-start border-5 border-primary ps-3 mb-4\">Newsletter</h5>\n");
      out.write("                <form action=\"\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control p-3\" placeholder=\"Your Email\">\n");
      out.write("                        <button class=\"btn btn-primary\">Sign Up</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <h6 class=\"text-uppercase mt-4 mb-3\">Follow Us</h6>\n");
      out.write("                <div class=\"d-flex\">\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-twitter\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-facebook\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square me-2\" href=\"#\"><i class=\"bi bi-linkedin\"></i></a>\n");
      out.write("                    <a class=\"btn btn-outline-primary btn-square\" href=\"#\"><i class=\"bi bi-instagram\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-12 text-center text-body\">\n");
      out.write("                <a class=\"text-body\" href=\"\">Terms & Conditions</a>\n");
      out.write("                <span class=\"mx-1\">|</span>\n");
      out.write("                <a class=\"text-body\" href=\"\">Privacy Policy</a>\n");
      out.write("                <span class=\"mx-1\">|</span>\n");
      out.write("                <a class=\"text-body\" href=\"\">Customer Support</a>\n");
      out.write("                <span class=\"mx-1\">|</span>\n");
      out.write("                <a class=\"text-body\" href=\"\">Payments</a>\n");
      out.write("                <span class=\"mx-1\">|</span>\n");
      out.write("                <a class=\"text-body\" href=\"\">Help</a>\n");
      out.write("                <span class=\"mx-1\">|</span>\n");
      out.write("                <a class=\"text-body\" href=\"\">FAQs</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container-fluid bg-dark text-white-50 py-4\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row g-5\">\n");
      out.write("            <div class=\"col-md-6 text-center text-md-start\">\n");
      out.write("                <p class=\"mb-md-0\">&copy; <a class=\"text-white\" href=\"#\">Your Site Name</a>. All Rights Reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Back to Top -->\n");
      out.write("<a href=\"#\" class=\"btn btn-primary py-3 fs-4 back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- JavaScript Libraries -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("<script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("<script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Template Javascript -->\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
