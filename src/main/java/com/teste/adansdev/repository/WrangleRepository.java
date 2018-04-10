package com.teste.adansdev.repository;

import com.teste.adansdev.entity.Wrangle;
import com.teste.adansdev.vo.TopGamerResponse;
import com.teste.adansdev.vo.TopGunsResponse;

import java.util.*;

public class WrangleRepository {


   public List<Wrangle> findAll() {
      return LoadJson.getInstance().load(EntityEnun.WRANGLE);
   }


   public List<TopGamerResponse> topGamer() {

       List<TopGamerResponse> topGamerResponses = new ArrayList<>();

      for (String name : playerNames()) {
         TopGamerResponse topGamerResponse  = new TopGamerResponse();
          topGamerResponse.setName(name);
          topGamerResponse.setDied((int) findAll().stream().filter(wrangle -> wrangle.getKilled().getName().equals(name)).count());
          topGamerResponse.setKill((int) findAll().stream().filter(wrangle -> wrangle.getKiller().getName().equals(name)).count());
          topGamerResponses.add(topGamerResponse);
      }

      return topGamerResponses;
   }


   private Set<String> playerNames() {

      Set<String> names = new HashSet<>();

       for (Wrangle wrangle : findAll()) {
           names.add(wrangle.getKilled().getName());
           names.add(wrangle.getKiller().getName());
       }

       return  names;
   }

    public List<TopGunsResponse> topGuns() {

        List<TopGunsResponse> topGunsResponses = new ArrayList<>();

        for (String gunsName : gunsNames()) {
            TopGunsResponse topGunsResponse  = new TopGunsResponse();
            topGunsResponse.setAmountKill((int) findAll().stream().filter(wrangle -> wrangle.getWeapon().equals(gunsName)).count());
        }

        return topGunsResponses;

    }

        private Set<String> gunsNames() {

            Set<String> gunsNames = new HashSet<>();

            for (Wrangle wrangle : findAll()) {
                gunsNames.add(wrangle.getWeapon());
            }

            return  gunsNames;
        }
}