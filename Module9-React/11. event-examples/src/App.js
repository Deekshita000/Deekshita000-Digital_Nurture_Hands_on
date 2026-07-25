import './App.css';
import EventExamples from './components/EventExamples';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  return (
      <div className="App">
        <h1>React Event Handling Examples</h1>

        <EventExamples />

        <hr />

        <CurrencyConvertor />
      </div>
  );
}

export default App;