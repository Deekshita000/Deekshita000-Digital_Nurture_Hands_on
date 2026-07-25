import './App.css';
import CohortDetails from './components/CohortDetails';
import { cohorts } from './data';

function App() {
  return (
      <div className="App">
        <h1>Cognizant Academy Dashboard</h1>

        {
          cohorts.map((cohort) => (
              <CohortDetails
                  key={cohort.id}
                  cohort={cohort}
              />
          ))
        }

      </div>
  );
}

export default App;