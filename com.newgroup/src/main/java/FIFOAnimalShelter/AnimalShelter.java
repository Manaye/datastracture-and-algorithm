package FIFOAnimalShelter;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class AnimalShelter {

        public enum AnimalType{
            DOG, CAT        }

        private int animalId;
        Queue<Integer> cats;
        Queue<Integer> dogs;

        public AnimalShelter(){
            cats = new LinkedList<Integer>();
            dogs = new LinkedList<Integer>();
        }

        public void enqueue(AnimalType type){
            switch(type){
                case DOG:
                    dogs.add(animalId);
                    animalId++;
                    break;
                case CAT:
                    cats.add(animalId);
                    animalId++;
                    break;
            }
        }
        public Integer dequeue(AnimalType type){

           Integer dequed = null;
            switch(type){
                case DOG:
                    dequed= dogs.remove();
                     break;
                case CAT:
                   dequed = cats.remove();
                    break;
                    default: return null;
            }
            return dequed;

            }
        }



