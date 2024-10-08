

public class DetailsBuilder {
    private Details details;

    public DetailsBuilder(){
        this.details=new Details();
    }

    public DetailsBuilder setName(String name){
        details.setName(name);
        return this;
    }

    public DetailsBuilder setPreferredName(String preferredName){
        details.setPreferredName(preferredName);
        return this;
    }
    
    public DetailsBuilder setWorking(boolean status){
        details.setWorking(status);
        return this;
    }

    public DetailsBuilder setAge(int age){
        details.setAge(age);
        return this;
    }
    public DetailsBuilder setCurrentLpa(double lpa){
        details.setCurrentLpa(lpa);
        return this;
    }
    public DetailsBuilder setExpectedLpa(double lpa){
        details.setExpectedLpa(lpa);
        return this;
    }
    public DetailsBuilder setInterstConflict(boolean status){
        details.setIntrestConflict(status);
        return this;
    }

    public Details build(){
        try {
            if(details.getName()!=null)return details;
            else throw new UserNameNotFoundException("User name Not found Exception");
        } catch (Exception e) {
            System.out.println("Please enter user name");
            System.out.println(e.getMessage());
            return null;
        }
    }
}

