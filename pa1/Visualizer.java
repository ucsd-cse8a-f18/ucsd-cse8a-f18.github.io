// Browser opening code courtesy of
// https://stackoverflow.com/a/17950164/2718315
import java.awt.Desktop;
import java.net.URI;

int getCSELatDegrees() { return CSELatDegrees; }
int getCSELatSeconds() { return CSELatSeconds; }
int getCSELongDegrees() { return CSELongDegrees; }
int getCSELongSeconds() { return CSELongSeconds; }
String getCSELabel() { return CSELabel; }

int getDestLatDegrees() { return destLatDegrees; }
int getDestLatSeconds() { return destLatSeconds; }
int getDestLongDegrees() { return destLongDegrees; }
int getDestLongSeconds() { return destLongSeconds; }
String getDestLabel() { return destLabel; }

int getDistance() { return distance; }

boolean showCSE = false;
if(getCSELatDegrees() != 0 &&
   getCSELatSeconds() != 0 &&
   getCSELongDegrees() != 0 &&
   getCSELongSeconds() != 0) {
  showCSE = true;
}

boolean showDest = false;
if(getDestLatDegrees() != 0 &&
   getDestLongDegrees() != 0) {
  showDest = true;
}

double latA = (double)getCSELatDegrees() + ((double)getCSELatSeconds() / 3600.0);
double lonA = (double)getCSELongDegrees() + ((double)getCSELongSeconds() / 3600.0);
double latB = (double)getDestLatDegrees() + ((double)getDestLatSeconds() / 3600.0);
double lonB = (double)getDestLongDegrees() + ((double)getDestLongSeconds() / 3600.0);

int zoom = 5;
if(!showCSE && !showDest) {
  zoom = 2;
}

int distance = 4000;

String url = "http://localhost:8000/maps.html?" +
  "latA=" + latA + "&" +
  "lonA=" + lonA + "&" +
  "latB=" + latB + "&" +
  "lonB=" + lonB + "&" +
  "distance=" + distance + "&" +
  "zoom=" + zoom + "&" +
  "showCSE=" + showCSE + "&" +
  "showDest=" + showDest + "&";

System.out.println(new URI(url));

if (Desktop.isDesktopSupported()) {
  Desktop.getDesktop().browse(new URI(url));
} else {
  System.out.println("Your system may not be supported, try running on the lab machines, or copy/paste this URL into your browser: \n" + url);
}
