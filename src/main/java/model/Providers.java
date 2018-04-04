package model;

import java.util.List;
import java.util.stream.Collectors;

public class Providers {
    private List<Provider> providers;

    public Providers(List<Provider> providers) {
        this.providers = providers;
    }

    public List<String> getProviderNames(){
        return providers.stream()
                .map(Provider::getName)
                .collect(Collectors.toList());
    }

    public Provider getProviderByName(String name){
        return providers.stream()
                .filter(provider -> provider.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
