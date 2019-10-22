package {{ package_name }}.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ulfy.android.system.ActivityUtils;
import com.ulfy.android.ui_injection.Layout;
import com.ulfy.android.ui_injection.ViewById;
import {{ package_name }}.R;
import {{ package_name }}.ui.base.BaseActivity;

@Layout(id = R.layout.{{ layout_id }})
public class {{ model_name }}Activity extends BaseActivity {
    {{ view_by_ids }}

    public static void startActivity() {
        ActivityUtils.startActivity({{ model_name }}Activity.class);
    }

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViewContent();
    }

    public void initViewContent() {

    }
}
