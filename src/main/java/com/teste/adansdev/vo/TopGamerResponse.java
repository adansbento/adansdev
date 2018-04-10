package com.teste.adansdev.vo;

   public class TopGamerResponse   {

      private String name;
      private Integer kill;
      private Integer died;
      private Integer point;

      @Override
      public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         TopGamerResponse that = (TopGamerResponse) o;

         return name != null ? name.equals(that.name) : that.name == null;
      }

      @Override
      public int hashCode() {
         return name != null ? name.hashCode() : 0;
      }

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public Integer getKill() {
         return kill;
      }

      public void setKill(Integer kill) {
         this.kill = kill;
      }

      public Integer getDied() {
         return died;
      }

      public void setDied(Integer died) {
         this.died = died;
      }

      public Integer getPoint() {
         point = kill - died;
         return point;
      }



   }