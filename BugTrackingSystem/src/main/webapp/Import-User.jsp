<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="en"><head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <title>Import User</title>
    <link rel="stylesheet" href="styles.css" media="screen">
<link rel="stylesheet" href="Import-User.css" media="screen">
    <script class="u-script" type="text/javascript" src="js/script.js"></script>
    <meta name="generator" content="Nicepage 4.18.5, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"logo": "np://user.desktop.nicepage.com/Site_57970666/images/29a5be6a011decb9171fdc8b405653fb729017d88122aa3327f9eae7144442728fb19cc32b0c599452f847997a1fb848485e890dcc7e371f5721c7_1280.png?rand=4b48"
}</script>
    <meta name="theme-color" content="#478ac9">
    <meta property="og:title" content="Import User">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body u-xl-mode" data-lang="en"><header class="u-black u-clearfix u-header u-header" id="sec-68d0"><div class="u-clearfix u-sheet u-sheet-1">
        <nav class="u-menu u-menu-one-level u-offcanvas u-menu-1">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg class="u-svg-link" viewBox="0 0 24 24"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
		</g></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-white u-text-hover-palette-2-base" href="#" style="padding: 10px 20px;">Home</a>
				</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-white u-text-hover-palette-2-base" href="Import-User.html" style="padding: 10px 20px;">Import User</a>
				</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-white u-text-hover-palette-2-base" href="Login.html" style="padding: 10px 20px;">Login</a>
				</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-white u-text-hover-palette-2-base" href="Register.html" style="padding: 10px 20px;">Register</a>
				</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="#">Home</a>
	</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Import-User.html">Import User</a>
	</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Login.html">Login</a>
	</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="Register.html">Register</a>
	</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section class="u-clearfix u-section-1" id="sec-8dea">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h3 class="u-text u-text-default u-text-1">Importing User</h3>
        <br>
        <br>
        <br>
        <div class="u-form u-form-1">
          <form action="import" class="u-clearfix u-form-custom-backend u-form-spacing-10 u-form-vertical u-inner-form" source="custom" name="form-1" style="padding: 10px;" redirect="true" onsubmit="importUser()">
            <div class="u-align-center u-form-group u-form-submit">
              <input type="submit" class="u-border-none u-btn u-btn-round u-btn-submit u-button-style u-hover-palette-1-light-2 u-radius-50">
            </div>
            <span id="msg"></span>
            <div class="u-form-send-message u-form-send-success"> Thank you! Your message has been sent. </div>
            <div class="u-form-send-error u-form-send-message"> Unable to send your message. Please fix errors then try again. </div>
            <input type="hidden" value="" name="recaptchaResponse">
          </form>
          
        </div>
      </div>
    </section>
    
    
    <footer class="u-align-center u-black u-clearfix u-footer u-footer" id="sec-aebe"><div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">BugByte</p>
      </div></footer>
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="https://nicepage.com/website-design" target="_blank">
        <span>Website Design</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="" target="_blank">
        <span>Web Design Software</span>
      </a>. 
    </section>
  
</body></html>