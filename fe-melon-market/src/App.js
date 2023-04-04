import Main from './view/main';
import Login from './view/login';
import {Routes, Route} from 'react-router-dom';

function App() {
  return (
    <div>
      <Routes>
        <Route path="/" element={<Main></Main>}> 
        </Route>
        <Route path="/login" element={<Login></Login>}>
        </Route>
      </Routes>
    </div>
  );
}

export default App;
