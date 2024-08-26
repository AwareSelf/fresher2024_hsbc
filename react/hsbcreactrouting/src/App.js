import logo from './logo.svg';
import './App.css';
import {BrowserRouter,Routes,Route} from 'react-router-dom';
import Home from './pages/Home';
import Layout  from './pages/Layout';
import ListEmp from './pages/ListEmp';
import EmpForm from './pages/EmpForm';
import NoPage from './pages/NoPage';

function App() {
  return (
    <div className="App">
      <header>

      <div>
        {/*  route ---mapped to---> component (to be visible) */}
          <BrowserRouter>
          <Routes>
            <Route path="/" element={<Layout />}>
              <Route index element={<Home />} />
              <Route path="addemp" element={<EmpForm />} />
              <Route path="listemp" element={<ListEmp />} />
              <Route path="*" element={<NoPage />} />
            </Route>
          </Routes>
        </BrowserRouter>
            
        </div>
       
      </header>
    </div>
  );
}

export default App;
