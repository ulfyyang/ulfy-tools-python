package {{ package_name }}.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.ulfy.android.utils.ui_inject.Layout;
import com.ulfy.android.utils.ui_inject.ViewById;
import com.ulfy.android.model.IViewModel;
import {{ package_name }}.R;
import {{ package_name }}.application.vm.{{ model_name }}VM;
import {{ package_name }}.ui.base.BaseView;

@Layout(id = R.layout.{{ layout_id }})
public class {{ model_name }}View extends BaseView {
    {{ view_by_ids }}
    private {{ model_name }}VM vm;

    public {{ model_name }}View(Context context) {
        super(context);
        init(context, null);
    }

    public {{ model_name }}View(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {

    }

    @Override public void bind(IViewModel model) {
        vm = ({{ model_name }}VM) model;
    }
}
