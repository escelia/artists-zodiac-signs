package zodiac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;

public class Application {


  public static void main(String[] args) throws Exception {
    String artist = "David Bowie";
    String response = wikipediaGetRequest(artist);

//    System.out.println("JSON String Result " + response);

    String parsedBirthdayStr = parseBirthday(response);
    Date birthDate = Date.parseMonthDay(parsedBirthdayStr);

//    System.out.println(birthDate);

    System.out.println(artist + " is a " + FindZodiac.findZodiacSign(birthDate).name());
//    MyPOSTRequest();
  }


  public static String wikipediaGetRequest(String artist) throws Exception {
    artist = artist.replaceAll(" ", "_");
    URL urlForGetRequest = new URL("https://en.wikipedia.org/w/api.php?action=parse&page=" + artist + "&format=json&section=0&prop=wikitext");
    String readLine;
    HttpURLConnection connection = (HttpURLConnection) urlForGetRequest.openConnection();
    connection.setRequestMethod("GET");
    int responseCode = connection.getResponseCode();
    if (responseCode == HttpURLConnection.HTTP_OK) {
      BufferedReader in = new BufferedReader(
          new InputStreamReader(connection.getInputStream()));
      StringBuffer response = new StringBuffer();
      while ((readLine = in.readLine()) != null) {
        response.append(readLine);
      } in.close();

      System.out.println(response.toString());
      return response.toString();

    } else {
      throw new Exception("Get request failed.");
    }
  }

  public static String parseBirthday(String response) {
    for(int i = 0; i < response.length(); i++) {
      if(i + 7 < response.length()) {
        if (response.substring(i, i + 7).toLowerCase().equals("{{birth")) {
          int j = i + 7;
          while (!response.substring(j, j + 2).equals("}}")) {
            j++;
          }
          return response.substring(i, j + 2);
        }
      }
    }
    return "";
  }



}