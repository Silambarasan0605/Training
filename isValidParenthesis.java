class Solution {
    public boolean isValid(String s) {
        Stack <Character> sim=new Stack<>();
        if(s.length()<=1 || s==null){
            return false;
        }
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                sim.push(c);
            }
            else{
                if(c==')'){
                    if(sim.isEmpty()||sim.pop()!='('){
                            return false;
                    }

                }


                if(c=='}'){
                    if(sim.isEmpty()||sim.pop()!='{'){
                            return false;
                    }

                }



                if(c==']'){
                    if(sim.isEmpty()||sim.pop()!='['){
                            return false;
                    }

                }

            }
        }
        if(!sim.isEmpty()) return false;
        return true;
    }
}
