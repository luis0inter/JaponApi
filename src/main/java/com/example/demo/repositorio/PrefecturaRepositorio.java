package com.example.demo.repositorio;

import com.example.demo.model.Prefectura;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PrefecturaRepositorio {
    public ArrayList<Prefectura> prefecturas = new ArrayList<>(Arrays.asList(

            // Hokkaido
            new Prefectura(1L, "Hokkaido", "Hokkaido", "Sapporo", 5250000),

            // Tohoku
            new Prefectura(2L, "Aomori", "Tohoku", "Aomori", 1238000),
            new Prefectura(3L, "Iwate", "Tohoku", "Morioka", 1210000),
            new Prefectura(4L, "Miyagi", "Tohoku", "Sendai", 2301000),
            new Prefectura(5L, "Akita", "Tohoku", "Akita", 966000),
            new Prefectura(6L, "Yamagata", "Tohoku", "Yamagata", 1068000),
            new Prefectura(7L, "Fukushima", "Tohoku", "Fukushima", 1833000),

            // Kanto
            new Prefectura(8L, "Ibaraki", "Kanto", "Mito", 2867000),
            new Prefectura(9L, "Tochigi", "Kanto", "Utsunomiya", 1933000),
            new Prefectura(10L, "Gunma", "Kanto", "Maebashi", 1939000),
            new Prefectura(11L, "Saitama", "Kanto", "Saitama", 7350000),
            new Prefectura(12L, "Chiba", "Kanto", "Chiba", 6284000),
            new Prefectura(13L, "Tokyo", "Kanto", "Shinjuku", 13960000),
            new Prefectura(14L, "Kanagawa", "Kanto", "Yokohama", 9237000),

            // Chubu
            new Prefectura(15L, "Niigata", "Chubu", "Niigata", 2201000),
            new Prefectura(16L, "Toyama", "Chubu", "Toyama", 1035000),
            new Prefectura(17L, "Ishikawa", "Chubu", "Kanazawa", 1133000),
            new Prefectura(18L, "Fukui", "Chubu", "Fukui", 767000),
            new Prefectura(19L, "Yamanashi", "Chubu", "Kofu", 810000),
            new Prefectura(20L, "Nagano", "Chubu", "Nagano", 2048000),
            new Prefectura(21L, "Gifu", "Chubu", "Gifu", 1979000),
            new Prefectura(22L, "Shizuoka", "Chubu", "Shizuoka", 3633000),
            new Prefectura(23L, "Aichi", "Chubu", "Nagoya", 7542000),

            // Kansai
            new Prefectura(24L, "Mie", "Kansai", "Tsu", 1771000),
            new Prefectura(25L, "Shiga", "Kansai", "Otsu", 1413000),
            new Prefectura(26L, "Kyoto", "Kansai", "Kyoto", 2578000),
            new Prefectura(27L, "Osaka", "Kansai", "Osaka", 8839000),
            new Prefectura(28L, "Hyogo", "Kansai", "Kobe", 5466000),
            new Prefectura(29L, "Nara", "Kansai", "Nara", 1324000),
            new Prefectura(30L, "Wakayama", "Kansai", "Wakayama", 923000),

            // Chugoku
            new Prefectura(31L, "Tottori", "Chugoku", "Tottori", 553000),
            new Prefectura(32L, "Shimane", "Chugoku", "Matsue", 671000),
            new Prefectura(33L, "Okayama", "Chugoku", "Okayama", 1888000),
            new Prefectura(34L, "Hiroshima", "Chugoku", "Hiroshima", 2800000),
            new Prefectura(35L, "Yamaguchi", "Chugoku", "Yamaguchi", 1342000),

            // Shikoku
            new Prefectura(36L, "Tokushima", "Shikoku", "Tokushima", 728000),
            new Prefectura(37L, "Kagawa", "Shikoku", "Takamatsu", 950000),
            new Prefectura(38L, "Ehime", "Shikoku", "Matsuyama", 1339000),
            new Prefectura(39L, "Kochi", "Shikoku", "Kochi", 698000),

            // Kyushu
            new Prefectura(40L, "Fukuoka", "Kyushu", "Fukuoka", 5135000),
            new Prefectura(41L, "Saga", "Kyushu", "Saga", 814000),
            new Prefectura(42L, "Nagasaki", "Kyushu", "Nagasaki", 1312000),
            new Prefectura(43L, "Kumamoto", "Kyushu", "Kumamoto", 1738000),
            new Prefectura(44L, "Oita", "Kyushu", "Oita", 1124000),
            new Prefectura(45L, "Miyazaki", "Kyushu", "Miyazaki", 1072000),
            new Prefectura(46L, "Kagoshima", "Kyushu", "Kagoshima", 1599000),

            // Okinawa
            new Prefectura(47L, "Okinawa", "Okinawa", "Naha", 1467000)
    ));
    public List<Prefectura> encontrarTodas(){
        return prefecturas;
    }

    public Optional<Prefectura>encontrarPorId(Long id){
        return prefecturas.stream().filter(p->p.getId().equals(id))
                .findFirst();
    }

    public Prefectura guardar(Prefectura prefectura){
        prefecturas.add(prefectura);
        return prefectura;
    }

    public boolean borrarPorId(Long id ){
        return prefecturas.removeIf(p->p.getId().equals(id));
    }
}
