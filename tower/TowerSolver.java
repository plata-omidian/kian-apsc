package tower;

public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        // Call the missing solve method (not this one)
        
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
    private void solve(int height, int source, int destination, int auxiliary)
    {
        if (height == 1)
        {
            model.move(source, destination);
            return;
        }
        solve(height - 1, source, auxiliary, destination);
        model.move(source, destination);
        solve(height - 1, auxiliary, destination, source);
    }

}
