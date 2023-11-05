package example;


import cn.com.webxml.WeatherWebServiceStub;


public class ClientMain {

    public static void main(String[] args) throws Exception {

        WeatherWebServiceStub stub = new WeatherWebServiceStub();
        WeatherWebServiceStub.GetWeatherbyCityName getWeatherbyCityName = new WeatherWebServiceStub.GetWeatherbyCityName();
        getWeatherbyCityName.setTheCityName("成都");
        WeatherWebServiceStub.GetWeatherbyCityNameResponse weatherbyCityName = stub.getWeatherbyCityName(getWeatherbyCityName);
        WeatherWebServiceStub.ArrayOfString getWeatherbyCityNameResult = weatherbyCityName.getGetWeatherbyCityNameResult();
        String[] strings = getWeatherbyCityNameResult.getString();
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}


