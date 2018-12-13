package FIFOAnimalShelter;


import org.junit.Test;
import static org.junit.Assert.*;
public class AnimalShelterTest {
    AnimalShelter shelter = new AnimalShelter();

    @Test
    public void testEnqueue() {
        for (int i = 0; i < 4; i++) {

            shelter.enqueue(AnimalShelter.AnimalType.DOG);
            shelter.enqueue(AnimalShelter.AnimalType.CAT);
        }
        int dogCount = shelter.dogs.size();
        int CatCount = shelter.cats.size();

            assertEquals(4, CatCount);
            assertEquals(4, dogCount);

    }

@Test
    public void testDequeue(){
    for(int i = 0; i < 4; i++){
        shelter.dequeue(AnimalShelter.AnimalType.DOG);
        shelter.dequeue(AnimalShelter.AnimalType.CAT);
    }

    assertEquals(2,shelter.cats.size());
    assertEquals(2,shelter.dogs.size());
    }
}
