package org.scoula.weather.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.weather.dto.WeatherDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@Log4j2
@RequestMapping("/weather")
@PropertySource({"classpath:/application.properties"})
public class WeatherController {
    @Value("${weather.url}")
    private String URL;

    @Value("${weather.icon_url}")
    private String ICON_URL;

    @Value("${weather.api_key}")
    private String API_KEY;

    @GetMapping({"", "/{city}"})
    public String weather(Model model,
                          @PathVariable(value="city", required=false) String city) {
        // 기본값 설정
        city = city == null ? "seoul" : city;
        // RestTemplate 인스턴스 생성
        RestTemplate restTemplate = new RestTemplate();
        // URL 구성
        String url = UriComponentsBuilder.fromHttpUrl(URL)
                .queryParam("q", city)
                .queryParam("units", "metric") // 섭씨 온도
                .queryParam("appid", API_KEY)
                .queryParam("lang", "kr") // 한국어
                .toUriString();
        // API 호출 및 데이터 변환
        WeatherDTO weatherDTO = restTemplate.getForObject(url, WeatherDTO.class);
        // 아이콘 URL 생성
        String iconUrl = ICON_URL.formatted(weatherDTO.getWeather().get(0).getIcon());
        // 로그
        log.info("오늘의 날씨: " + weatherDTO);
        // 모델에 데이터 추가
        model.addAttribute("city", city);
        model.addAttribute("weather", weatherDTO);
        model.addAttribute("iconUrl", iconUrl);

        return "weather/today";
    }
}