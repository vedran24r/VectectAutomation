package APITest.PetStore;

import org.testng.annotations.Test;
import org.vectect.Base.BaseTest;
import org.vectect.Controllers.PetStoreController;
import org.vectect.model.PetStore.Category;
import org.vectect.model.PetStore.Pet;
import org.vectect.model.PetStore.PetStatus;
import org.vectect.model.PetStore.Tag;

import java.io.IOException;

public class AddPetsTest extends BaseTest {

    @Test
    private void verifyPetAdded() throws IOException {
        PetStoreController controller = new PetStoreController();
        System.out.println(controller.getPet(1));
        Category category = new Category(1, "firstCategory");
        Pet pet = new Pet(
                1,
                category,
                "myPetName",
                new String[]{"https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FAtrial_septal_defect&psig=AOvVaw1VoxbyQETkY1W85pYSIbnC&ust=1671632340447000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCLDD9PCxiPwCFQAAAAAdAAAAABAE"},
                new Tag[]{new Tag(1, "firstTag")},
                PetStatus.available
        );
        // System.out.println(controller.addPet(pet));
    }
}
