<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html style="font-size: 16px;" lang="en"><head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="BugByte">
    <meta name="description" content="">
    <title>PROJECT MANAGER(MAIN PAGE)</title>
    <link rel="stylesheet" href="styles.css" media="screen">
<link rel="stylesheet" href="PROJECT-MANAGER(MAIN-PAGE).css" media="screen">
    <script class="u-script" type="text/javascript" src="jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="js/script.js" defer=""></script>
    <meta name="generator" content="Nicepage 4.18.5, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"logo": "images/default-logo.png"
}</script>
    <meta name="theme-color" content="#478ac9">
    <meta property="og:title" content="PROJECT MANAGER(MAIN PAGE)">
    <meta property="og:type" content="website">
  </head>
  <body class="u-body u-xl-mode" data-lang="en"><header class="u-black u-border-2 u-border-grey-90 u-clearfix u-header u-header" id="sec-95a9"><div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <a href="https://nicepage.com" class="u-image u-logo u-image-1">
          <img src="images/default-logo.png" class="u-logo-image u-logo-image-1">
        </a>
        <nav class="u-menu u-menu-one-level u-offcanvas u-menu-1">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg class="u-svg-link" viewBox="0 0 24 24"><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
              <svg class="u-svg-content" version="1.1" id="menu-hamburger" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</g></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px 20px;">Home</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px 20px;">Import User</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px 20px;">Login</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" style="padding: 10px 20px;">Register</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link">Home</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link">Import User</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link">Login</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link">Register</a>
</li></ul>
              </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
          </div>
        </nav>
      </div></header>
    <section class="u-clearfix u-section-1" id="sec-462d">
      <div class="u-clearfix u-sheet u-sheet-1">
        <h3 class="u-align-right u-text u-text-default u-text-1">USER INFORMATION</h3>
        <div class="u-align-right u-table u-table-responsive u-table-1">
          <table class="u-table-entity">
            <colgroup>
              <col width="42.2%">
              <col width="57.8%">
            </colgroup>
            <tbody class="u-table-body u-table-body-1">
		            <%@ page import="com.company.model.User" %>
		            <%
		            	User pm = (User)request.getAttribute("user");
		            %>
                  <tr>
                  	<th><p class="u-text u-text-default u-text-2">Email</p></th>
                  	<td class="u-table-cell"></td>
                  	<td><%=pm.getUserEmail()%></td>
                  </tr>
                   <tr>
                  	<th><p class="u-text u-text-default u-text-2">Role</p></th>
                  	<td class="u-table-cell"></td>
                  	<td><%=pm.getTypeOfUser() %></td>
                  </tr>
                  <tr>
                  	<th><p class="u-text u-text-default u-text-2">Last Seen</p></th>
                  	<td class="u-table-cell"></td>
                  	<td><%=(Integer)request.getAttribute("time") %> hrs ago </td>
                  </tr>
                  </tbody>
            </table>
                  
        </div><span class="u-align-left u-icon u-text-palette-1-base u-icon-1"><svg class="u-svg-link" preserveAspectRatio="xMidYMin slice" viewBox="0 0 55 55" style=""><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#svg-17c4"></use></svg><svg class="u-svg-content" viewBox="0 0 55 55" x="0px" y="0px" id="svg-17c4" style="enable-background:new 0 0 55 55;"><path d="M55,27.5C55,12.337,42.663,0,27.5,0S0,12.337,0,27.5c0,8.009,3.444,15.228,8.926,20.258l-0.026,0.023l0.892,0.752
	c0.058,0.049,0.121,0.089,0.179,0.137c0.474,0.393,0.965,0.766,1.465,1.127c0.162,0.117,0.324,0.234,0.489,0.348
	c0.534,0.368,1.082,0.717,1.642,1.048c0.122,0.072,0.245,0.142,0.368,0.212c0.613,0.349,1.239,0.678,1.88,0.98
	c0.047,0.022,0.095,0.042,0.142,0.064c2.089,0.971,4.319,1.684,6.651,2.105c0.061,0.011,0.122,0.022,0.184,0.033
	c0.724,0.125,1.456,0.225,2.197,0.292c0.09,0.008,0.18,0.013,0.271,0.021C25.998,54.961,26.744,55,27.5,55
	c0.749,0,1.488-0.039,2.222-0.098c0.093-0.008,0.186-0.013,0.279-0.021c0.735-0.067,1.461-0.164,2.178-0.287
	c0.062-0.011,0.125-0.022,0.187-0.034c2.297-0.412,4.495-1.109,6.557-2.055c0.076-0.035,0.153-0.068,0.229-0.104
	c0.617-0.29,1.22-0.603,1.811-0.936c0.147-0.083,0.293-0.167,0.439-0.253c0.538-0.317,1.067-0.648,1.581-1
	c0.185-0.126,0.366-0.259,0.549-0.391c0.439-0.316,0.87-0.642,1.289-0.983c0.093-0.075,0.193-0.14,0.284-0.217l0.915-0.764
	l-0.027-0.023C51.523,42.802,55,35.55,55,27.5z M2,27.5C2,13.439,13.439,2,27.5,2S53,13.439,53,27.5
	c0,7.577-3.325,14.389-8.589,19.063c-0.294-0.203-0.59-0.385-0.893-0.537l-8.467-4.233c-0.76-0.38-1.232-1.144-1.232-1.993v-2.957
	c0.196-0.242,0.403-0.516,0.617-0.817c1.096-1.548,1.975-3.27,2.616-5.123c1.267-0.602,2.085-1.864,2.085-3.289v-3.545
	c0-0.867-0.318-1.708-0.887-2.369v-4.667c0.052-0.52,0.236-3.448-1.883-5.864C34.524,9.065,31.541,8,27.5,8
	s-7.024,1.065-8.867,3.168c-2.119,2.416-1.935,5.346-1.883,5.864v4.667c-0.568,0.661-0.887,1.502-0.887,2.369v3.545
	c0,1.101,0.494,2.128,1.34,2.821c0.81,3.173,2.477,5.575,3.093,6.389v2.894c0,0.816-0.445,1.566-1.162,1.958l-7.907,4.313
	c-0.252,0.137-0.502,0.297-0.752,0.476C5.276,41.792,2,35.022,2,27.5z"></path></svg></span>
        <a href="NEW-PROJECT.html" class="u-border-2 u-border-palette-2-base u-btn u-btn-round u-button-style u-hover-palette-2-base u-none u-radius-6 u-text-body-color u-text-hover-white u-btn-1">Add Project</a>
        <h3 class="u-align-right u-text u-text-default u-text-2">List Of Projects</h3>
        <div class="u-expanded-width u-table u-table-responsive u-table-2">
        
          <table class="u-table-entity">
            <%@ page import="com.company.model.Project, java.util.*"%>
            <%
            	List<Project> projects = new ArrayList<Project>();
            	projects = (ArrayList<Project>)request.getAttribute("projects");
            %>
            <colgroup>
              <col width="14.5%">
              <col width="85.5%">
            </colgroup>
            <thead class="u-black u-table-header u-table-header-1">
              <tr style="height: 59px;">
                <th class="u-border-1 u-border-black u-table-cell">SNo.</th>
                <th class="u-border-1 u-border-black u-table-cell">Project Name</th>
              </tr>
            </thead>
            <tbody class="u-table-body">
              <%
              	int count = 0;
              	for(Project project:projects){
              		count++;
             		%>
              	<tr style="height: 75px;">
	                <td class="u-border-1 u-border-grey-30 u-table-cell"><%=count%></td>
	            <td class="u-border-1 u-border-grey-30 u-table-cell">
                  <a class="u-active-none u-border-none u-btn u-button-link u-button-style u-hover-none u-none u-text-palette-1-base u-btn-2" href="PROJECT-DETAILS.html"><%=project.getProjectName()%></a>
                </td>
                </tr>
              	<% }%>
            </tbody>
          </table>
        </div>
      </div>
    </section>
    
    
    <footer class="u-align-center u-black u-clearfix u-footer u-footer" id="sec-2212"><div class="u-clearfix u-sheet u-sheet-1">
        <h2 class="u-text u-text-1">BugByte</h2>
      </div></footer>
    <section class="u-backlink u-clearfix u-grey-80">
      <a class="u-link" href="https://nicepage.com/html-templates" target="_blank">
        <span>HTML Template</span>
      </a>
      <p class="u-text">
        <span>created with</span>
      </p>
      <a class="u-link" href="https://nicepage.best" target="_blank">
        <span>Website Builder</span>
      </a>. 
    </section>
  
</body></html>