package com.mycompany.btl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrepareGui {

    public Weather_App weather;
    public JsonResult result ;
    public ArrayList<Weather> listResult;
    public int idx = 0;

    public PrepareGui() {
        weather = new Weather_App();
        result = API.getJsonData("Hà nội");
        show();
        prepare();
    }

    public Weather_App getWeather() {
        return weather;
    }

    private void prepare() {
        weather.getBt_find().setActionCommand("find");
        weather.getBt_find().addActionListener(new ButtonClick());

        weather.getBt_next().setActionCommand("next");
        weather.getBt_next().addActionListener(new ButtonClick());

        weather.getBt_pre().setActionCommand("pre");
        weather.getBt_pre().addActionListener(new ButtonClick());
    }

    public void show() {
//        result = API.getJsonData((String) weather.jTextField1.getText());
        String date = result.getList()[idx].getDt_txt();
        String city = result.getCity().getName() + "," +  result.getCity().getCountry();
        String weath = result.getList()[idx].getWeather()[0].getDescription();
        String nhietDo = result.getList()[idx].getMain().getTemp() + "°C";
        String apXuat = "Pressure: " + result.getList()[idx].getMain().getPressure() +"Pa";
        String doAm = " Humidity: " + result.getList()[idx].getMain().getHumidity() + "%";
        String winSpeed = " Wind: " + result.getList()[idx].getWind().getSpeed() + "km/h";
        String clouds = " Cloud: " + result.getList()[idx].getClouds().getAll() + "%";
//        String nhietDo_min = "Nhiệt độ thấp nhất: " + result.getList()[idx].getMain().getTemp_min() + "độ C";
//        String nhietDo_max = "Nhiệt độ cao nhất: " + result.getList()[idx].getMain().getTemp_max() + "độ C";
        String nhietDo_thuc = "Feels like: : " + result.getList()[idx].getMain().getFeels_like() + "°C";
//        String muc_nuoc = "Mực nước biển: " + result.getList()[idx].getMain().getSea_level() + "chưa biết là m hay cm";
//        String tam_nhin = "Tầm nhìn: " + Integer.(result.getList()[idx].getVisibility() + "m");
        
        
        weather.lb_temperature.setText(nhietDo);
        weather.lb_date.setText(date);
        weather.lb_wind.setText(winSpeed);
        weather.lb_weather.setText(weath.toUpperCase());
        weather.lb_city.setText(city);
        weather.lb_clouds.setText(clouds);
        weather.lb_pressure.setText(nhietDo_thuc);
//        weather.lb_temperature_feels.setText(nhietDo_thuc);
//        weather.lb_temperature_min.setText(nhietDo_min);
//        weather.lb_temperature_max.setText(nhietDo_max);
//        weather.lb_sea_level.setText(muc_nuoc);
        weather.lb_humidity.setText(doAm);
//        weather.lb_visibility.setText(tam_nhin);

        weather.lb_date2.setText(result.getList()[8].getDt_txt().substring(0, 10));
        weather.lb_temperature2.setText(result.getList()[8].getMain().getTemp() + "°C");
        weather.lb_weather2.setText(result.getList()[8].getWeather()[0].getDescription());
        
        weather.lb_date3.setText(result.getList()[16].getDt_txt().substring(0, 10));
        weather.lb_temperature3.setText(result.getList()[16].getMain().getTemp() + "°C");
        weather.lb_weather3.setText(result.getList()[16].getWeather()[0].getDescription());
        
        weather.lb_date4.setText(result.getList()[24].getDt_txt().substring(0, 10));
        weather.lb_temperature4.setText(result.getList()[24].getMain().getTemp() + "°C");
        weather.lb_weather4.setText(result.getList()[24].getWeather()[0].getDescription());
        
        weather.lb_date5.setText(result.getList()[32].getDt_txt().substring(0, 10));
        weather.lb_temperature5.setText(result.getList()[32].getMain().getTemp() + "°C");
        weather.lb_weather5.setText(result.getList()[32].getWeather()[0].getDescription());
  }

    public class ButtonClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.equals("find")) {
                find();
                if (null == result.getList()) {
                    JOptionPane.showMessageDialog(weather, "Not found");
                }
                idx = 0;
            } else if (command.equals("next")) {
                if (idx == 39) {
                    idx = idx;
                    JOptionPane.showMessageDialog(weather, "Not found");
                } else {
                    idx++;
                }
            } else if (command.equals("pre")) {
                if (idx == 0) {
                    idx = idx;
                    JOptionPane.showMessageDialog(weather, "Not found");
                } else {
                    idx = idx - 1;
                }

            }
            show();
        }

        public void find() {

            result = API.getJsonData((String) weather.jTextField1.getText());

        }
    }
}
