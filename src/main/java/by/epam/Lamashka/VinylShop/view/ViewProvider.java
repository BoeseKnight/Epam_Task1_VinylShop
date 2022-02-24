package by.epam.Lamashka.VinylShop.view;

import java.util.HashMap;
import java.util.Map;

public class ViewProvider {
  private Map<Integer, View> views = new HashMap<>();

  public ViewProvider() {
    views.put(0, null);
    views.put(1, new AuthorizationView());
    views.put(2, new RegistrationView());
    views.put(3, new CustomerView());
    views.put(4, new AdminView());
  }

  public View getView(Integer option) {
    return views.get(option);
  }
}