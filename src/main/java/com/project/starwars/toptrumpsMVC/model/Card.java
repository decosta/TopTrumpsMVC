package com.project.starwars.toptrumpsMVC.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.tools.javac.code.Attribute;

import java.util.*;

public class Card {

    /**
     * An object of type Card represents a playing card from the
     * Top Trumps Deck. The card has different categories which have a numerical
     *  assigned to it.
     */

        private String name;
        private Category height;
        private Category brains;
        private Category darkside;
        private Category jedipowers;
        private Category battleskills;
        private Category forcefactor;


        private Map<CategoryType, Integer> categories = new HashMap<>();

        @JsonProperty("Name")
        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        @JsonProperty("Height")
        public Category getHeight() { return height; }

        public void setHeight(Category height) {
            this.height = height;
        }

        @JsonProperty("Brains")
        public Category getBrains() { return brains; }

        public void setBrains(Category brains) {
            this.brains = brains;
        }

        @JsonProperty("Dark_Side")
        public Category getDarkside() { return darkside; }

        public void setDarkside(Category darkside) {
            this.darkside = darkside;
        }

        @JsonProperty("Jedi_Powers")
        public Category getJedipowers() { return jedipowers; }

        public void setJedipowers(Category jedipowers) {
            this.jedipowers = jedipowers;
        }

        @JsonProperty("Battle_Skills")
        public Category getBattleskills() { return battleskills; }

        public void setBattleskills(Category battleskills) {
            this.battleskills = battleskills;
        }

        @JsonProperty("Force_Factor")
        public Category getForcefactor() { return forcefactor; }

        public void setForcefactor(Category forcefactor) {
            this.forcefactor = forcefactor;
        }

        @Override
        public String toString() {
            return "Card [name=" + name + ", height=" + height + ", brains="
                    + brains + ", darkside=" + darkside + ", jedipowers=" + jedipowers
                    + ", battleskills=" + battleskills + ", forcefactor=" + forcefactor + "]";
        }
    }

