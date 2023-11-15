import React, { useEffect } from 'react';
import styled from 'styled-components';
import TitleBox from '../../Common/Atoms/TitleBox';
import ExitButton from '../../Common/Atoms/ExitButton';
import JoinInterface from '../Organisms/JoinInterface';
import { useBGM } from '../../../sound/SoundContext';
const ContentDiv = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
`;

const DictionaryJoin = () => {
  const { startBGM, isMuted } = useBGM();
  useEffect(() => {
    if (!isMuted) {
      startBGM('multiWait');
    }
  }, []);
  return (
    <div>
      <TitleBox>국어사전 놀이</TitleBox>
      <ContentDiv>
        <JoinInterface />
      </ContentDiv>
      <ExitButton to="/main" />
    </div>
  );
};

export default DictionaryJoin;
