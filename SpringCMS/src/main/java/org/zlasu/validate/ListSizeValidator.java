package org.zlasu.validate;

        import org.zlasu.category.Category;

        import javax.validation.ConstraintValidator;
        import javax.validation.ConstraintValidatorContext;
        import java.util.List;

public class ListSizeValidator implements ConstraintValidator<ListSize, List<Category>> {

    private int max;

    @Override
    public void initialize(ListSize maxListSize) {
        this.max = maxListSize.max();
    }

    @Override
    public boolean isValid(List<Category> categories, ConstraintValidatorContext constraintValidatorContext) {
        if (categories == null) {
            return true;
        }

        return categories.size() <= max;
    }
}
